import React from "react";
import { useState } from 'react';
import styled, { ThemeProvider } from 'styled-components';
import { Button } from '../components/styles';
import PreCombatScreen from "./PreCombatScreen";


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

const SuccessScreen = ({stage, startPreCombat}) => {


    const navClick = (event) => {
        event.preventDefault();

        startPreCombat()
    }

    return (
        <ThemeProvider theme={theme}>
            <Title>Combat Result</Title>
    
            <StyledForm onSubmit={navClick}>
                <h2>You have slain that filthy creature</h2>
                <Button type="submit">Continue Your Adventure</Button>
            </StyledForm> 
        </ThemeProvider>
    );
};
export default SuccessScreen