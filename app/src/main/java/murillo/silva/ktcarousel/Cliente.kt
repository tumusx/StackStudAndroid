package murillo.silva.ktcarousel

import android.os.Parcel
import android.os.Parcelable

class Cliente(var codigo: Int, var nomeCliente: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    // TODO transforma em bytes o atributo da classe

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(codigo)
        parcel.writeString(nomeCliente)
    }

    // todo identificador de classe do projeto

    override fun describeContents(): Int {
        return 0
    }

    // TODO todas as classes devem conter esse atributo

    companion object CREATOR : Parcelable.Creator<Cliente> {

        override fun createFromParcel(parcel: Parcel): Cliente {
            return Cliente(parcel)

        }

        override fun newArray(size: Int): Array<Cliente?> {
            return arrayOfNulls(size)
        }
    }
}