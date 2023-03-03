package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityAbilityInvokeEntry.*;
import org.sorapointa.proto.EntityAbilityInvokeEntry;

public class ClientAbilitiesInitFinishCombineNotify {
    @Tag(tag=1) public List<EntityAbilityInvokeEntry> entityInvokeList = new ArrayList<>();
}
