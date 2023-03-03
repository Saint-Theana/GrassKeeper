package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallengeDataNotify {
    @Tag(tag=8) public Integer value = null;
    @Tag(tag=2) public Integer challengeIndex = null;
    @Tag(tag=9) public Integer paramIndex = null;
}
