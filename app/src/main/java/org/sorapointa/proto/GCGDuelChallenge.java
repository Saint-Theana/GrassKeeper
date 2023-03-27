package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDuelChallenge {
    @Tag(tag=9) public Integer totalProgress = null;
    @Tag(tag=10) public Integer challengeId = null;
    @Tag(tag=1) public Integer curProgress = null;
}
