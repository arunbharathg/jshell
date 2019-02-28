Set<Integer> integers = Set.of(1,2,3,4,5);
Set<Integer> dropWhileFilteredSet = integers.stream().sorted().dropWhile(i -> i < 3).collect(Collectors.toSet());
dropWhileFilteredSet.forEach(System.out::println)
Set<Integer> takeWhileFilteredSet = integers.stream().sorted().takeWhile(i -> i < 3).collect(Collectors.toSet());
takeWhileFilteredSet.forEach(System.out::println)
