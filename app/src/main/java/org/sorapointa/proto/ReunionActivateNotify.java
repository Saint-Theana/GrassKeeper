package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionBriefInfo.*;
import org.sorapointa.proto.ReunionBriefInfo;

public class ReunionActivateNotify {
    @Tag(tag=9) public Boolean isActivate = null;
    @Tag(tag=13) public ReunionBriefInfo reunionBriefInfo = null;
}
