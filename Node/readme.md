# Nodejs

## System requirements

- installed version of `nodejs`, depending on the features used in the kata, one that supports said features
- Node Version Manger recommended to manage installation

## Dependencies

- `jest`: Testing library
- `@types-jest`: type definitions for jest
- `@ts-jest`: typescript preprocessor for jest

## Get Started

In our 'Node' directory run npm install to pull the required Dependencies

## Run Tests

Run all tests
`npm run test`

## Run specific Test

For demonstration purposes let's assume you want to test the example kata

`npm run jest -- katas/example/sum.spec.ts`

## How to create a kata and tests

Just create a folder for your kata in the `katas/` directory.
Create the code in a regular `.ts` file and add the `.spec.ts` file for the test suite.

### Note

We currently to not transpile the typescript files to JavaScript, you can only execute the tests which handle that for us
