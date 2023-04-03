package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class EntityAbilityInvokeEntry {
    @Tag(tag=4) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
    @Tag(tag=9) public Integer entityId = null;
}
