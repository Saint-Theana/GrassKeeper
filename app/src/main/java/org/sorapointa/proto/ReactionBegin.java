package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReactionBegin {
    @Tag(tag=8) public Integer skillId = null;
    @Tag(tag=3) public Integer cardGuid = null;
}
