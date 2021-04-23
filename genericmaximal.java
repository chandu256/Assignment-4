public final class genericmaximal
{
public static <T extends object & comparable<?super T>>
T max(List <? extends T> List,int begin,int end)
{
T maxElem=List.get(begin);
for(++begin;begin<end;++begin)
if(maxElem.compareTo(List.get(begin))<0)
maxElem=List.get(begin);
return maxElem;
}
}