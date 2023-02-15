import ContainerBox from "../components/ContainerBox";
import React from "react";
import styled from "styled-components";
import Title from "../components/Title";
import TextBox from "../components/TextBox";
import Button from "../components/Button";

const StartScreen = ({nextStage}) => {

    const onStartClick = () => {

        nextStage("Creator");
    }


    return (
        <ContainerBox>
            <Title>Aventure the MisAdventure</Title>
            <TextBox>Luis Trigo</TextBox>
            <StartMenu>
                <Button onClick={onStartClick}>Start</Button>
            </StartMenu>
            
        </ContainerBox>
    )
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

export default StartScreen;
