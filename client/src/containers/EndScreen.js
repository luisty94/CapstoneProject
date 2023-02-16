import ContainerBox from "../components/ContainerBox";
import React from "react";
import styled from "styled-components";
import Title from "../components/Title";
import TextBox from "../components/TextBox";
import Button from "../components/Button";

const EndScreen = ({nextStage}) => {

    const onStartClick = () => {

        nextStage("Start");
    }


    return (
        <ContainerBox>
            <Title>CONGRATULATIONS</Title>
            <TextBox>You have cleaned the forest from its filthy creatures</TextBox>
            <StartMenu>
                <Button onClick={onStartClick}>Try Again</Button>
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

export default EndScreen;
