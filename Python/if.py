age = int(input("Enter your age: "))

if age > 100:
  print('You are too old to sign up')
elif age >= 18:
   print("You are now singed up")
elif age < 0:
    print("You haven't been born yet")
else:
    print("You must be 18+ to sign up")

r = input("Would you like food ? (y/n)")
if r == "y":
    print("Fuck you! We have no food")
else:
     print("Bye")

name = input("Enter your name: ")
if name == "":
   print("Hello stranger!")
else:
    print(f"Hello {name}")

for_sale = False

if for_sale:
     print("For sale")
else:
     print("Not for sale")
