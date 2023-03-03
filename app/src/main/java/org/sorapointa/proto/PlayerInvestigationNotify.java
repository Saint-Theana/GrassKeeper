package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Investigation.*;
import org.sorapointa.proto.Investigation;

public class PlayerInvestigationNotify {
    @Tag(tag=1) public List<Investigation> investigationList = new ArrayList<>();
}
