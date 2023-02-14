import { useState } from 'react';
import styled from 'styled-components';
import {postCharacter} from './CharacterService';

import { DisplayCard, ErrorMessage, Button } from './styles';

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

const CharacterForm = ({ addCharacter,  }) => {
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

    const onSubmit = (event) => {
        event.preventDefault();

        if (!formData.character_type || !formData.name){
            setErrorMessage("Adventurer?");
            return;
        }
        postCharacter(formData)
            .then((data) => {
                addCharacter(data);
            })
        /* reset the form */
        setFormData({
            character_type:"",
            name: ""
        })
    };

    return (
        <StyledForm onSubmit={onSubmit}>
            <h2>Choose your path</h2>

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
            <Button type="submit">Save</Button>
        </StyledForm>
    );
}

export default CharacterForm;