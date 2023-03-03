package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientMassiveEntity.*;
import org.sorapointa.proto.ClientMassiveEntity;

public class CreateMassiveEntityReq {
    @Tag(tag=1) public List<ClientMassiveEntity> massiveEntityList = new ArrayList<>();
}
