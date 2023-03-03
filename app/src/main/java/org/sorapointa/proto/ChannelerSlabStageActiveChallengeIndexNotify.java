package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabStageActiveChallengeIndexNotify {
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=12) public Integer challengeIndex = null;
    @Tag(tag=6) public Integer activeCampIndex = null;
}
