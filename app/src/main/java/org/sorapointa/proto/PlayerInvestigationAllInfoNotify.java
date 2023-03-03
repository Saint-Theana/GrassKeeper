package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Investigation.*;
import org.sorapointa.proto.Investigation;
import org.sorapointa.proto.InvestigationTarget.*;
import org.sorapointa.proto.InvestigationTarget;

public class PlayerInvestigationAllInfoNotify {
    @Tag(tag=15) public List<Investigation> investigationList = new ArrayList<>();
    @Tag(tag=12) public List<InvestigationTarget> investigationTargetList = new ArrayList<>();
}
