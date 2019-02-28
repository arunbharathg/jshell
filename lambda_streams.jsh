List<String> strings = Arrays.asList("One","Two","Three","Four","Five");
List<String> sortedList = strings.stream().sorted((s1, s2) -> s1.length()-s2.length()).collect(Collectors.toList());
sortedList.forEach(System.out::println)
