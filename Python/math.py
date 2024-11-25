import math

# friends = 5
# friends += 1
# friends -= 2
# friends *= 3
# friends /= 2
# friends **= 2
# remainder = friends % 9
# x = 3.14
# y = -4
# z = 9.5
#
# result =  round(x)
# result = abs(y)
# result = pow(4,3)
# result = max(x,y,z)
# result = min(x,y,z)
# print(math.pi)
# print(math.sqrt(z))
# print(math.ceil(z))
# print(math.floor(z))

#Bai 1 + 2
# radius = float(input("Nhap ban kinh: "))
# print(f"Chu vi hinh tron la: { round(2*math.pi*radius,2)}")
# print(f"Dien tich hinh tron la: { round(math.pi*radius**2,2)}")
# print(f"Dien tich hinh tron la: { round(math.pi*pow(radius,2),2)}")

#Bai 3
canh1 = int(input("Nhap canh goc vuong 1: "))
canh2 = int(input("Nhap canh goc vuong 2: "))
huyen = math.sqrt(pow(canh1,2) + pow(canh2,2))
print(f"Do dai canh huyen la: {round(huyen,2)}")




