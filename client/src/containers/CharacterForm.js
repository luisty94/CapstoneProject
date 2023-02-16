import { useState } from 'react';
import {postCharacter} from '../CharacterService';
import styled, { ThemeProvider } from 'styled-components';
import React from 'react';
import ContainerBox from '../components/ContainerBox';
import Input from '../components/Input';
import Button from '../components/Button';
import TextBox from '../components/TextBox';
import Title from '../components/Title';

import { ErrorMessage } from '../components/styles';

const FormWrap = styled.div`
    display: grid;
    grid-template-columns: 6rem 15rem;
`;

const StyledForm = styled.form`
    border-bottom: 1px solid black;
    display: flex;
    flex-direction: column;
    gap: 0.25rem;

    > * {
        margin: 0;
    }
`;

const CharacterForm = ({ addCharacter, setActiveCharacter, nextStage}) => {
    
    const [formData, setFormData] = useState({
        character_type:"HERO",
        name: ""

    });
    const [errorMessage, setErrorMessage] = useState("");

    const onChange = (event) => {
        const newFormData = Object.assign({}, formData);
        newFormData[event.target.name] = event.target.value;
        setFormData(newFormData);
    };

    const handleChange = (event) => {
        const newFormData = Object.assign({}, formData);
        newFormData["character_type"] = event.target.value;
        setFormData(newFormData);
    }

    const onStartClick = (event) => {
        event.preventDefault();

        if (!formData.character_type || !formData.name){
            setErrorMessage("Adventurer?");
            return;
        }
        postCharacter(formData)
            .then((data) => {
                addCharacter(data);
                setActiveCharacter(data);
                nextStage("PreCombat")
            })
        }
            
    

    return (
        <ContainerBox>
            <Title>Character Creator</Title>
    
            <StartMenu>
                <TextBox>Choose your path</TextBox>

                <ErrorMessage>{errorMessage}</ErrorMessage>

                <FormWrap>
                    <label htmlFor="character_type">Class:</label>
                    <select onChange={handleChange}>
                        <option>HERO</option>
                        <option>THIEF</option>
                        <option>WARRIOR</option>
                    </select>
                </FormWrap>
                <FormWrap>
                    <label htmlFor="name">Name:</label>
                    <input
                        onChange={onChange}
                        type="text"
                        id="name"
                        name="name"
                        value={formData.name}
                        required /> 
                </FormWrap>

                {/* <input type="submit" value="Save" id="save" /> */}
                <Button onClick={onStartClick}>Save</Button>
            </StartMenu> 
        </ContainerBox>
    );
}

const StartMenu = styled.div`
    display: flex;
    align-items: center;
    flex-direction: column;
    justify-content: center;
    padding: 1rem;

    button {
        width: 10rem;
    }
`

export default CharacterForm;