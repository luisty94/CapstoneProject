import React from "react";
import { useState } from 'react';
import styled, { ThemeProvider } from 'styled-components';
import { Button } from '../components/styles';
import PreCombatScreen from "./PreCombatScreen";
import { postHeal } from "../CharacterService";
import ContainerBox from "../components/ContainerBox";


const StyledForm = styled.form`
    border-bottom: 1px solid black;
    display: flex;
    flex-direction: column;
    gap: 2rem;

    > * {
        margin: 0;
    }
`;
const Title = styled.h1`
    text-align: center;
`;

const theme = {
    headerColour: '#e5feff',
    checkedInColour: 'rgb(104 185 255 / 50%)',
    checkedOutColor: 'white',
};

const RetreatScreen = ({stage, startPreCombat, activeCharacter, setActiveCharacter}) => {


    const navClick = (event) => {
        event.preventDefault();


        const characterObj = {
            characterId: activeCharacter.id
        }       
        postHeal(characterObj).then((res) => {

            setActiveCharacter({
                ...activeCharacter,
                healthValue: res.healthValue
            })
            startPreCombat()
            }
        ); 

    }
    

    return (
        <ContainerBox>
            <Title>Combat Result</Title>
    
            <StyledForm onSubmit={navClick}>
                <h2>RUN FOR YOUR LIFE!</h2>
                <Button type="submit">Continue Your Adventure</Button>
            </StyledForm> 
        </ContainerBox>
    );
};
export default RetreatScreen