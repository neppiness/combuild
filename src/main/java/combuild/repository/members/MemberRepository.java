package combuild.repository.members;

import combuild.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    public Member save(Member member);
    public Optional<Member> findById(long id);
    public Optional<Member> findByName(String name);
    public Optional<List<Member>> findAll();
}
