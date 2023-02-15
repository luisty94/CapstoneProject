import styled, { css } from 'styled-components';

export const DisplayCard = styled.div`
    border: 1px solid black;
    border-radius: 0.25rem;

    margin: 0.25rem;

    /* padding: 0.5rem; */
/* 
    h3 {
        border-bottom: 1px solid black;
        margin-bottom: 0;
    } */
`;

export const ErrorMessage = styled.p`
    color: red;
`;

export const Button = styled.button`

    font-size: inherit;

    ${ props => 
        props.small ? css`` : css`
            width: 10rem;
        `
    }

`;

export const ButtonBar = styled.div`
    display: flex;
    justify-content: space-between;
`;