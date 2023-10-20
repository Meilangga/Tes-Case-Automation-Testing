Feature: Checkout product

  Scenario: Checkout product
    Given User membuka halaman login
    When User memasukan username
    And User memasukan password
    And User menekan tombol login
    And User berhasil login
    And User membuka halaman produk
    And User memilih produk dengan menekan tombol tambah ke keranjang
    And User menekan tombol icon keranjang
    And User membuka halaman cart
    And User menekan tombol checkout
    And User memasukan first name
    And User memasukan last name
    And User memasukan postal code
    And User menekan tombol continue
    And User membuka halaman checkout overview
    And User menekan tombol finish
    And User membuka halaman checkout complete
    Then User menekan tombol back


