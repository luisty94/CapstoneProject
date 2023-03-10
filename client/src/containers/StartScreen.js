import ContainerBox from "../components/ContainerBox";
import React from "react";
import styled from "styled-components";
import Title from "../components/Title";
import TextBox from "../components/TextBox";
import Button from "../components/Button";
import StartBackground from "../components/StartBackground";

const StartScreen = ({nextStage, updateBackground}) => {

    const onStartClick = () => {

        nextStage("Creator");
    }


    return (
        <ContainerBox>
            <StartBackground updateBackground={updateBackground} />
            <Title>Aventure the MisAdventure</Title>
            <TextBox>Luis Trigo</TextBox>
            <StartMenu>
                <Button onClick={onStartClick}>New Game</Button>
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
