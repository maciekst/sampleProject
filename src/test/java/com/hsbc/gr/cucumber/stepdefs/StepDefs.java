package com.hsbc.gr.cucumber.stepdefs;

import com.hsbc.gr.MortgageApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MortgageApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
