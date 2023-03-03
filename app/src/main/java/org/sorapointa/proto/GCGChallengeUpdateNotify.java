package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDuelChallenge.*;
import org.sorapointa.proto.GCGDuelChallenge;

public class GCGChallengeUpdateNotify {
    @Tag(tag=12) public Integer serverSeq = null;
    @Tag(tag=13) public GCGDuelChallenge challenge = null;
}
