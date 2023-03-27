package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallengeRecord {
    @Tag(tag=2) public Integer bestValue = null;
    @Tag(tag=15) public Integer challengeIndex = null;
    @Tag(tag=3) public Integer challengeId = null;
    @Tag(tag=5) public Integer challengeRecordType = null;
}
