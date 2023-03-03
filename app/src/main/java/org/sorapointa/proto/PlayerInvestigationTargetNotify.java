package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InvestigationTarget.*;
import org.sorapointa.proto.InvestigationTarget;

public class PlayerInvestigationTargetNotify {
    @Tag(tag=1) public List<InvestigationTarget> investigationTargetList = new ArrayList<>();
}
