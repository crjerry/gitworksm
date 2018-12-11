h = input('height:')
w = input('weight:')
bmi = float(w)/(float(h)*float(h))
print(bmi)
if bmi < 18.5:
    print('过轻')
elif 18.5 <= bmi < 25:
    print('正常')
elif 25 <= bmi < 28:
    print('过重')
elif 28 <= bmi < 32:
    print('fat')
elif bmi >= 32:
    print('严重肥胖')

