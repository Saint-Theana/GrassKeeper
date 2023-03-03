package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class ClientAbilityChangeNotify {
    @Tag(tag=9) public Boolean isInitHash = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=3) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
}
