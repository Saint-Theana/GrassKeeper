package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HuntingRevealClueNotify {
    @Tag(tag=5) public Integer finishClueCount = null;
    @Tag(tag=4) public Vector cluePosition = null;
    @Tag(tag=12) public HuntingPair huntingPair = null;
    @Tag(tag=7) public Integer finishedGroupId = null;
}
