package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomBriefInfo.*;
import org.sorapointa.proto.BlossomBriefInfo;

public class WorldOwnerBlossomBriefInfoNotify {
    @Tag(tag=13) public List<BlossomBriefInfo> briefInfoList = new ArrayList<>();
}
