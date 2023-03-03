package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityActionServerMonsterLog {
    @Tag(tag=2,isSigned=true) public List<Integer> paramList = new ArrayList<>();
}
