package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class EntityAbilityInvokeEntry {
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=1) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
}
