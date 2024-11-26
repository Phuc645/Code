name = input("What is your name ?: ")
age = int(input("How old are you ?: "))
age += 1
print(f"Hello {name}")
print("HAPPY BIRTHDAY!")
print(f"You are {age}")


#Bai1
length = int(input("Nhap chieu dai: "))
width = int(input("Nhap chieu rong: "))
print(f"Dien tich hinh chu nhat la : {length*width} cm²")
#Bai2
item = input("Nhap ten hang: ")
price = float(input("Nhap gia: "))
quantity = int(input("Nhap so luong: "))
print(f"Ban mua {quantity} {item}, tong tien la: {price*quantity}")