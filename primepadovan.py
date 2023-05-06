p0=1 #first term of series
p1=1 #second term of the series
p2=1 #third term of the series
pn=p0+p1 #current term of the series
n=int(input(("Enter a number:"))) #number till which the series need to be printed
while(pn<=n):
  ctr=0
  for i in range(1,pn+1):
    if(pn%i==0):
      ctr=ctr+1
  if(ctr==2):
    print("{}".format(pn))
  p0=p1
  p1=p2
  p2=pn
  pn=p0+p1