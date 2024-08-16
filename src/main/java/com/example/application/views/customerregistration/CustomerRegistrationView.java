package com.example.application.views.customerregistration;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Customer Registration ")
@Route(value = "customer-registration-", layout = MainLayout.class)
@AnonymousAllowed
public class CustomerRegistrationView extends Composite<VerticalLayout> {

    public CustomerRegistrationView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        Icon icon = new Icon();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField textField2 = new TextField();
        EmailField emailField = new EmailField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.addClassName(Gap.SMALL);
        layoutColumn2.addClassName(Padding.LARGE);
        layoutColumn2.setWidth("min-content");
        layoutColumn2.setMinWidth("400px");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        h3.setText("Personal Information");
        h3.setWidth("100%");
        icon.setIcon("lumo:user");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Full name");
        datePicker.setLabel("Birthday");
        textField2.setLabel("Phone Number");
        emailField.setLabel("Email");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.setMinWidth("128px");
        buttonPrimary.setMaxWidth("136px");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(icon);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(textField2);
        formLayout2Col.add(emailField);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
    }
}
