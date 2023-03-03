package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2DungeonInfoNotify {
    @Tag(tag=2) public Integer challengeModeDifficulty = null;
    @Tag(tag=4) public Integer skillNo = null;
    @Tag(tag=13) public Integer levelId = null;
}
