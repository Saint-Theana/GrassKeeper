package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaReInitOverrideMap {
    @Tag(tag=2) public List<AbilityScalarValueEntry> overrideMap = new ArrayList<>();
}
