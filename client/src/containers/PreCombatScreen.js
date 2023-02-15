import React from "react";
import { useState } from 'react';
import styled, { ThemeProvider } from 'styled-components';
import { Button } from '../components/styles';


const StyledForm = styled.form`
    border-bottom: 1px solid black;
    display: flex;
    flex-direction: column;
    gap: 0.25rem;

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
        <ThemeProvider theme={theme}>
            <Title>Boku Boku Forest</Title>
    
            <StyledForm onSubmit={nextCombatClick}>
                <h2>A smelly creature approaches! Are you ready to fight?</h2>
                <Button type="submit">FIGHT!</Button>
            </StyledForm> 
        </ThemeProvider>
    );
};
export default PreCombatScreen