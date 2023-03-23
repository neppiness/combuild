package combuild.repository.members;

import combuild.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {

    private static HashMap<Long, Member> idToMember = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(sequence++);
        idToMember.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(long id) {
        return Optional.ofNullable(idToMember.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return idToMember.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public Optional<List<Member>> findAll() {
        return Optional.empty();
    }
}
