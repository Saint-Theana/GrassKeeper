package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientMassiveEntity.*;
import org.sorapointa.proto.ClientMassiveEntity;

public class DestroyMassiveEntityNotify {
    @Tag(tag=7) public List<ClientMassiveEntity> massiveEntityList = new ArrayList<>();
}
