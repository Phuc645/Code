operator = input("Enter an operator (+ - * / ^ abs ): ")


if operator == "+":
    num1 = int(input("Enter the 1st number: "))
    num2 = int(input("Enter the 2nd number: "))
    print(num1 + num2)
elif operator == "-":
    num1 = int(input("Enter the 1st number: "))
    num2 = int(input("Enter the 2nd number: "))
    print(num1 - num2)
elif operator == "*":
    num1 = int(input("Enter the 1st number: "))
    num2 = int(input("Enter the 2nd number: "))
    print(num1 * num2)
elif operator == "/":
    num1 = int(input("Enter the 1st number: "))
    num2 = int(input("Enter the 2nd number: "))
    print(round(num1 / num2,2))
elif operator == "^":
    num1 = int(input("Enter the 1st number: "))
    num2 = int(input("Enter the 2nd number: "))
    print(pow(num1,num2))
elif operator == "abs":
    num = int(input("Enter a number: "))
    print(abs(num))
else:
    print("Not vaild")