import React from "react";
import { useState } from 'react';
import styled, { ThemeProvider } from 'styled-components';
import { Button } from '../components/styles';
import ContainerBox from "../components/ContainerBox";


const StyledForm = styled.form`
    border-bottom: 1px solid black;
    display: flex;
    flex-direction: column;
    gap: 0.25rem;
    justify-content: center;
    align-items: center;



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

const PreCombatScreen = ({stage, startCombatA}) => {


    const nextCombatClick = (event) => {
        event.preventDefault();

        startCombatA()
    }

    return (
        <ContainerBox>
            <Title>Boku Boku Forest</Title>
    
            <StyledForm onSubmit={nextCombatClick}>
                <h2>A smelly creature approaches! Are you ready?</h2>
                <Button type="submit">FIGHT!</Button>
            </StyledForm> 
        </ContainerBox>
    );
};
export default PreCombatScreen