package handledropdown;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment3NumCapcha {

static int num1=0;

static int num2=0;

static String op= null;



public static void main(String[] args) {

// TODO Auto-generated method stub



WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



driver.get("https://timesofindia.indiatimes.com/poll.cms");



String capcha=driver.findElement(By.id("mathq2")).getText(); //getting text from capcha

System.out.println("input number is " +capcha);

//System.out.println(capcha.length());

WebElement textField= driver.findElement(By.xpath("//input[@id='mathuserans2']")); //getting location of textfield

String[] capSplit= capcha.split(" "); //splitting capcha by space

num1= Integer.parseInt(capSplit[0]); //storing first number in num1

num2= Integer.parseInt(capSplit[2]); //storing second number in num2

op= capSplit[1]; //storing operator in op

switch(op) {

case "+":

System.out.println(num1+num2);

textField.sendKeys(Integer.toString(num1+num2)); //sending text in textfield

break;

case "-":

System.out.println(num1-num2);

textField.sendKeys(Integer.toString(num1-num2));

break;

case "*":

System.out.println(num1*num2);

textField.sendKeys(Integer.toString(num1*num2));

break;

case "/":

System.out.println(num1/num2);

textField.sendKeys(Integer.toString(num1/num2));

break;

default:

System.out.println("Wrong operator");

}

//System.out.println(num1);

//System.out.println(num2);

driver.close();

}



}

