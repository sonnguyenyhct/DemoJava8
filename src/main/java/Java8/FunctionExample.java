package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class UserN{
        String name;
        String email;
        String password;

        public UserN(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }
    }
    class Member {
        String name;
        String email;

        public Member(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

public class FunctionExample {
    public static void main(String[] args) {
        Function<UserN,Member> mapUserToMember = u -> new Member(u.name,u.email);
        UserN userN = new UserN("Son","son@gmail.com","1234");
        Member member = mapUserToMember.apply(userN);
        System.out.println(member.name);

        List<UserN> users = Arrays.asList(
                new UserN("gpcoder1", "gpcoder@gmail.com","123"),
                new UserN("gpcoder2", "gpcoder@gmail.com","123"),
                new UserN("gpcoder3", "gpcoder@gmail.com","123")
        );
        List<Member> members = users.stream().map(mapUserToMember).collect(Collectors.toList());
        System.out.println(members.size());
    }
}
