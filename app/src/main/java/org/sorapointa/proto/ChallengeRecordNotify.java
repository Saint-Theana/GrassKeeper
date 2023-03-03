package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChallengeRecord.*;
import org.sorapointa.proto.ChallengeRecord;

public class ChallengeRecordNotify {
    @Tag(tag=2) public Integer groupId = null;
    @Tag(tag=5) public List<ChallengeRecord> challengeRecordList = new ArrayList<>();
}
