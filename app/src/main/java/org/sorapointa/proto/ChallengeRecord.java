package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallengeRecord {
    @Tag(tag=14) public Integer challengeRecordType = null;
    @Tag(tag=15) public Integer challengeIndex = null;
    @Tag(tag=1) public Integer challengeId = null;
    @Tag(tag=8) public Integer bestValue = null;
}
