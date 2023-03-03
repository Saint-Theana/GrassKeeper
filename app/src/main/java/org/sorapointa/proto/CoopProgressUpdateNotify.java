package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoopProgressUpdateNotify {
    @Tag(tag=11) public Integer curCoopPoint = null;
    @Tag(tag=12) public Boolean isHaveProgress = null;
}
