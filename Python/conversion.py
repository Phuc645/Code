

weight = float(input("Nhap can nang cua ban: "))
unit = input("Kg hay pound? (K/P): ")

if unit == "K":
    weight *= 2.205
    unit = "Lbs"
    print(f'Can nang cua ban la {round(weight,2)} {unit}')
elif unit == "P":
    weight /= 2.205
    unit = "kg"
    print(f'Can nang cua ban la {round(weight,2)} {unit}')
else:
     print('Sai cu phap')


temp = float(input("Nhap nhiet do: "))
unit = input("C hay F: ")
if unit == "C":
    temp = (temp * 9) / 5 + 32
    print(f"Nhiet do la: {round(temp,2)} F")
elif unit == "F":
    temp = (temp - 32) * 5 / 9
    print(f"Nhiet do la: {round(temp, 2)} C")
else:
    print("Sai cu phap")





