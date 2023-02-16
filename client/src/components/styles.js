import styled, { css } from 'styled-components';


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