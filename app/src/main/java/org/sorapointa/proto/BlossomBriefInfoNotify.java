package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomBriefInfo.*;
import org.sorapointa.proto.BlossomBriefInfo;

public class BlossomBriefInfoNotify {
    @Tag(tag=4) public List<BlossomBriefInfo> briefInfoList = new ArrayList<>();
}
