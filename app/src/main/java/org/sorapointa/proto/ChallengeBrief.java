package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallengeBrief {
    @Tag(tag=9) public Integer curProgress = null;
    @Tag(tag=5) public Boolean isSuccess = null;
    @Tag(tag=15) public Integer challengeIndex = null;
    @Tag(tag=2) public Integer challengeId = null;
}
