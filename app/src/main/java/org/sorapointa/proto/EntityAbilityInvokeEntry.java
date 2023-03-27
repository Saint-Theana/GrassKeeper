package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityAbilityInvokeEntry {
    @Tag(tag=4) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
    @Tag(tag=9) public Integer entityId = null;
}
